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
public class StateSembilan  implements State {

    @Override
    public void down(MatrixContext context) {
        
    }

    @Override
    public void up(MatrixContext context) {
        context.setState(new StateEnam());
        System.out.println("On Position 6");
    }

    @Override
    public void left(MatrixContext context) {
        context.setState(new StateDelapan());
        System.out.println("On Position 8");
    }

    @Override
    public void right(MatrixContext context) {
        
    }
}