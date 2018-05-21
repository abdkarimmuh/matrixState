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
public class StateSatu implements State {

    @Override
    public void down(MatrixContext context) {
        context.setState(new StateEmpat());
        System.out.println("On Position 4");
    }

    @Override
    public void up(MatrixContext context) {
        
    }

    @Override
    public void left(MatrixContext context) {
        
    }

    @Override
    public void right(MatrixContext context) {
        context.setState(new StateDua());
        System.out.println("On Position 2");
    }
    
}
