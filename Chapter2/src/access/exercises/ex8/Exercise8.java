/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package access.exercises.ex8;

/**
 *
 * @author cpolychronopoulos
 */
public class Exercise8 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            ConnectionManager.getConnection();
        }
    }
}

class ConnectionManager {
    private Connection[] conns;
    private static int numOfConns;
    
    public static Connection getConnection()
    {
        if (numOfConns < 10)
        {
            ++numOfConns;
            return Connection.createConnection();
        }
            
        else
        {
            System.err.println("Number of connections exceeded.");
            return null;
        }
            
    }
}

class Connection {
    private Connection() {};
    
    static Connection createConnection()
    {
        return new Connection();
    }
}