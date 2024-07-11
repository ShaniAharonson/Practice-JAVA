package SqlCommands;

public class AddValues {
    public static String ADDING_TEACHERS =
            "INSERT INTO `k2`.`teachers` (`FirstName`, `LastName`) " +
                    "VALUES (?, 'Shalom');";
    public static String ADDING_STUDENTS =
            "INSERT INTO `k2`.`students` (`StudentId`, `FirstName`, `LastName`, `TeacherId`) " +
                    "VALUES (?, ?, ?, ?);";
    public static String STUDENTS_VS_TEACHERS =
            "SELECT CONCAT(students.firstname,' ',students.lastname) " +
                    "AS 'student_full_name', concat(teachers.FirstName, ' ', " +
                    "teachers.LastName) " +
                    "AS 'teacher_full_name'" +
                    "FROM k2.teachers JOIN k2.students" +
                    "ON teachers.TeacherId = students.StudentId;";
}
