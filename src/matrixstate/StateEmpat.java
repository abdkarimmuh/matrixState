/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixstate;

/**
 *
 * @author Karim
 */
public class StateEmpat implements State {

    @Override
    public void down(MatrixContext context) {
        context.setState(new StateTujuh());
        System.out.println("On Position 7");
    }

    @Override
    public void up(MatrixContext context) {
        context.setState(new StateSatu());
        System.out.println("On Position 1");
    }

    @Override
    public void left(MatrixContext context) {
        
    }

    @Override
    public void right(MatrixContext context) {
        context.setState(new StateLima());
        System.out.println("On Position 5");
    }
}