/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasses.ex20;

/**
 *
 * @author cpolychronopoulos
 */
public class Exercise20 {

        public static void main(String[] args) {
            new IParser.Parser().parse();
        }
}

interface IParser {

    void parse();

    class Parser implements IParser {

        @Override
        public void parse() {
            System.out.println("Parsing...");
        }

    }
}
