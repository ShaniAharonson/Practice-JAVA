package JDBC_17_01_2024.cls;

public class SQLcommands {
    //create table
    public static final String CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS `class169`.`students` (" +
                    "  `id` INT NOT NULL AUTO_INCREMENT," +
                    "  `name` VARCHAR(45) NULL," +
                    "  `tel` VARCHAR(45) NULL," +
                    "  `avgGrade` INT NULL," +
                    "  `city` VARCHAR(45) NULL," +
                    "`married` TINYINT NULL"+
                    "  PRIMARY KEY (`id`));";


    public static final String addStudent = "INSERT INTO `class169`.`students` " +
            "(`name`, `tel`, `avgGrade`, `city`, `married`) " +
            "VALUES (?, ?, ?, ?, ?);";
    public static final String getAllStudents = "SELECT * FROM `class169`.`students`";

    //CRUD

}
