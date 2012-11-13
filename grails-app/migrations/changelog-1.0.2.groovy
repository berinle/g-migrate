databaseChangeLog = {

	changeSet(author: "berinle (generated)", id: "1352801068099-1") {
		createTable(tableName: "person_pet") {
			column(name: "person_pets_id", type: "bigint")

			column(name: "pet_id", type: "bigint")
		}
	}

	changeSet(author: "berinle (generated)", id: "1352801068099-2") {
		createTable(tableName: "pet") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "petPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "berinle (generated)", id: "1352801068099-3") {
		addForeignKeyConstraint(baseColumnNames: "person_pets_id", baseTableName: "person_pet", constraintName: "FK2878C93556FBEC9B", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "person", referencesUniqueColumn: "false")
	}

	changeSet(author: "berinle (generated)", id: "1352801068099-4") {
		addForeignKeyConstraint(baseColumnNames: "pet_id", baseTableName: "person_pet", constraintName: "FK2878C93575A9B770", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "pet", referencesUniqueColumn: "false")
	}
}
