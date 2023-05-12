package com.mycompany.banco.de.dados;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author gabri
 */
public class TesteBanco {

    public static void main(String[] args) {
        Conexao com = new Conexao();
        JdbcTemplate banco = com.getConnection();

        banco.execute("DROP TABLE filme IF EXISTS;");

        banco.execute(
                "CREATE TABLE filme ("
                + "id INT PRIMARY KEY AUTO_INCREMENT,"
                + "nome VARCHAR(255) NOT NULL,"
                + "ano_lancamento int NOT NULL"
                + ");"
        );

        banco.update("INSERT INTO  filme VALUES  (null, 'O jogo da imitação', 2005)");
        
//        melhor maneira pra fazer 

        String insert = "INSERT INTO filme VALUES(null, ?, ?)";
        String nomeFilme = "Shrek";
        Integer anoFilme = 2005;
        
        banco.update(insert, nomeFilme, anoFilme);
        

        List filmes = banco.queryForList("SELECT * FROM filme");
        System.out.println(filmes);
        
        List<Filme> listaFilmes = banco.query("SELECT * FROM filme", new BeanPropertyRowMapper<>(Filme.class));
        
        for (Filme itemFilme : listaFilmes) {
            if(itemFilme.getAnoLancamento().equals(2005)){
            System.out.println("É de 2005");
            }
            System.out.println(itemFilme);    
        }
        
          List<Filme> listaFilmes2005 = banco.query("SELECT * FROM filme", new BeanPropertyRowMapper<>(Filme.class), 2005);
        System.out.println(listaFilmes2005);

        
            banco.update("DELETE FROM filme WHERE ano_lancamento = 2005");
            System.out.println("Filmes de 2005");
            System.out.println(listaFilmes);
    }
}
