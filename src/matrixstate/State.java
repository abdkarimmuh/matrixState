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
public interface State {
    public void down(MatrixContext context);
    public void up(MatrixContext context);
    public void left(MatrixContext context);
    public void right(MatrixContext context);
}
