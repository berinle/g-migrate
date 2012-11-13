databaseChangeLog = {

	changeSet(author: "berinle (generated)", id: "1352800195216-1") {
		addColumn(tableName: "person") {
			column(name: "age", type: "integer") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "berinle (generated)", id: "1352800195216-2") {
		addColumn(tableName: "person") {
			column(name: "last_name", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}
}
