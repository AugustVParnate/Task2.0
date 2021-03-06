package model;

import java.util.ArrayList;
import java.util.List;

public class CommonFigureProperties implements Figure {
    private int id;
    private final List<Point> points;

    public CommonFigureProperties(List<Point> points) {
        id = 0;
        this.points = points;
    }

    public CommonFigureProperties(int id, List<Point> points) {
        this.id = id;
        this.points = points;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public ArrayList<Point> getPoints() {
        return new ArrayList<>(points);
    }
}
