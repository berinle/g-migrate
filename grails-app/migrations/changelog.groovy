databaseChangeLog = {

	changeSet(author: "berinle (generated)", id: "1350257677712-1") {
		createTable(tableName: "person") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "personPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "first_name", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}
}
