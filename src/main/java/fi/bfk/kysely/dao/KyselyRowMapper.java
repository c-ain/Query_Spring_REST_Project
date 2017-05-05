package fi.bfk.kysely.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import fi.bfk.kysely.bean.Kysely;


public class KyselyRowMapper implements RowMapper<Kysely>{

	public Kysely mapRow(ResultSet rs, int rowNum) throws SQLException{
		Kysely ky = new Kysely();
		ky.setId(rs.getInt("id"));
		ky.setNimi(rs.getString("nimi"));
		ky.setKysymys_id(rs.getInt("kysymys_id"));
		ky.setKysymys(rs.getString("kysymys"));
		ky.setVastaus_id(rs.getInt("vastaus_id"));
		ky.setVastaus(rs.getString("vastaus"));
		
		return ky;
		
	}
}
