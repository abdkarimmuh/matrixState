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
public class MatrixContext {
    private State state = new StateSatu();

    public void setState(State state) {
        this.state = state;
    }
    
    public void turnDown() {
        this.state.down(this);
    }
    
    public void turnUp() {
        this.state.up(this);
    }
    
    public void turnLeft() {
        this.state.left(this);
    }
    
    public void turnRight() {
        this.state.right(this);
    }
}
