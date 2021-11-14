package s7_abtract_class_interface.practice.interfaceComparator;

import s5_access_modifier.exercise.circle.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if(c1.getRadius() > c2.getRadius()) return 1;
        else if(c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
