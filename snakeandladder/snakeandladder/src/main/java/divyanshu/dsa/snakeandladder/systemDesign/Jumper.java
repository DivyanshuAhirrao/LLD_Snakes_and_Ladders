package divyanshu.dsa.snakeandladder.systemDesign;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode
public class Jumper {
    int startPt;
    int endPt;

    public Jumper(int startPt, int endPt){
        this.startPt = startPt;
        this.endPt = endPt;
    }
}
