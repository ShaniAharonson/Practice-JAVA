package SqlCommands;

public class AllCommands {
    public static final String CREATE_SCHEMA = "CREATE SCHEMA `k2` ;";
    public static final String CREATE_TEACHERS_TABLE = "CREATE TABLE `k2`.`teachers` (" +
            "  `TeacherId` INT NOT NULL AUTO_INCREMENT," +
            "  `FirstName` VARCHAR(45) NOT NULL," +
            "  `LastName` VARCHAR(45) NOT NULL," +
            "  PRIMARY KEY (`TeacherId`));";
    public static final String CREATE_STUDENTS_TABLE = "CREATE TABLE `k2`.`students` (" +
            "  `StudentId` INT NOT NULL AUTO_INCREMENT," +
            "  `FirstName` VARCHAR(20) NOT NULL," +
            "  `LastName` VARCHAR(45) NOT NULL," +
            "  `TeacherId` INT NOT NULL," +
            "  PRIMARY KEY (`StudentId`)," +
            "  INDEX `fkTeachers_idx` (`TeacherId` ASC) VISIBLE," +
            "  CONSTRAINT `fkTeachers`" +
            "    FOREIGN KEY (`TeacherId`)" +
            "    REFERENCES `k2`.`teachers` (`TeacherId`)" +
            "    ON DELETE CASCADE" +
            "    ON UPDATE NO ACTION);";

}
