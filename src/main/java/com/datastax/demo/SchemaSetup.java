package com.datastax.demo;

public class SchemaSetup extends RunCQLFile {

	SchemaSetup(String cqlFile) {
		super(cqlFile);
	}

	public static void main(String args[]){
		
		SchemaSetup setup = new SchemaSetup("cql/create_schema.cql");
		
		
		setup.internalSetup(false);
		setup.shutdown();
		
		setup = new SchemaSetup("cql/create_functions.cql");
		
		setup.internalSetup(true);
		setup.shutdown();

	}
}
