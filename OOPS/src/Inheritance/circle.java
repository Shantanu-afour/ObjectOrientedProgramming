package Inheritance;

class circle{

    double radius;

    circle(){
        radius = 0;
    }
    circle(double r){
        radius = r;
    }
    double circleArea(){
        return (Math.PI * radius *radius);
    }
}

class sector extends circle{

    double angle;
    sector(double a, double r){
        angle = a;
        radius = r;
    }

    sector(){
        angle = 0;
        radius = 0;
    }
    double sectorArea(){
        return (0.5*radius*radius*angle);
    }
}

class segment extends circle{

    double length;
    segment(){
        radius = 0;
        length = 0;
    }
    segment(double l,double r){
        radius = r;
        length = l;
    }
    double segmentArea(){
        double h = radius - Math.pow(Math.pow(radius, 2) - Math.pow((length / 2), 2), 0.5);
        return ((h / (6 * length)) * ((3 * h * h) + (4 * length * length)));
    }
}
