package textBasedRPG;


public class DatabaseQueries {
    public static void main(String[] args) {
        if(DatabaseConnection.main(args)){
            System.out.println("Connection successful");
        }
        else {
            System.out.println("Connection failed");
        };

    }
    public static void login(String username, String password) {
        String query="SELECT * FROM users WHERE username='"+username+"' AND password='"+password+"'";
        DatabaseConnection.main(args);
        st.executeQuery(query);

    }
    public static void register(String username, String password) {
        String query="INSERT INTO users (username, password) VALUES ('"+username+"', '"+password+"')";
        DatabaseConnection.main(args);
        st.executeUpdate(query);
    }
    public static void setPlayer(String username) {
        String query="SELECT * FROM players WHERE username='"+username+"'";
        DatabaseConnection.main(args);
        if(!st.executeQuery(query)){
            String query1 = 'INSERT INTO players (username, health, attack, defense, level, experience, gold) VALUES ('+username+', 100, 10, 10, 1, 0, 0)';
        };
        else {
            return st.executeQuery(query);
        }
        
    }
}
