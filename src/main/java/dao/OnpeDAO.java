package dao;

public class OnpeDAO {
	//db.Db db = new db.Db("sql5108.site4now.net", "db_a952ba_onpe_admin", "onpe1234", "db_a952ba_onpe");
	db.Db db = new db.Db("DESKTOP-J64IA3M","sa","yanilapas777","Onpe");
	
	/* participacion*/
	public Object getVotos(int inicio, int fin) {
		db.Sentencia( String.format( "usp_getVotosP %s,%s", inicio, fin ) );
		return db.getRegistros();
	}

	public Object getVotosDepartamento(String id) {
		db.Sentencia( String.format( "usp_getVotosDepartamento '%s'", id ) );
		return db.getRegistros();
	}
	
	public Object getVotosProvincia(String id) {
		db.Sentencia( String.format( "usp_getVotosProvincia '%s'", id ) );
		return db.getRegistros();
	}
	
	public Object getGrupoVotacion(String id) {
		db.Sentencia( String.format( "usp_getGrupoVotacion '%s'", id ) );
		return db.getRegistro();
	}
	
	/* actas*/
	 public Object getGruposVotacion(String id) {
		 db.Sentencia(String.format("usp_getGrupoVotacion '%s'",id));
		 return db.getRegistros();
	 }
	 
	 
}
