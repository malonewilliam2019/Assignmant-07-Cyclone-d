import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {


        double point1Lat =25 , point1Long =-15 ;
        double point2Lat =23 , point2Long =-20 ;
        double point3Lat =21 , point3Long =-24 ;
        double point4Lat =20 , point4Long =-27 ;
        double point5Lat =19 , point5Long =-35 ;
        double point6Lat =21 , point6Long =-46 ;
        double point7Lat =23 , point7Long =-56 ;
        double point8Lat =25 , point8Long =-65 ;
        double point9Lat =28 , point9Long =-70 ;
        double point10Lat =32 , point10Long =-73 ;
        double point11Lat =34 , point11Long =-74 ;
        double point12Lat =36 , point12Long =-74 ;
        double point13Lat =39 , point13Long =-74 ;

        double d1=calcD(calcC(calcA(convertRadians(point1Lat),convertRadians(point1Long),convertRadians(point2Lat),convertRadians(point2Long))));
        double d2=calcD(calcC(calcA(convertRadians(point2Lat),convertRadians(point2Long),convertRadians(point3Lat),convertRadians(point3Long))));
        double d3=calcD(calcC(calcA(convertRadians(point3Lat),convertRadians(point3Long),convertRadians(point4Lat),convertRadians(point4Long))));
        double d4=calcD(calcC(calcA(convertRadians(point4Lat),convertRadians(point4Long),convertRadians(point5Lat),convertRadians(point5Long))));
        double d5=calcD(calcC(calcA(convertRadians(point5Lat),convertRadians(point5Long),convertRadians(point6Lat),convertRadians(point6Long))));
        double d6=calcD(calcC(calcA(convertRadians(point6Lat),convertRadians(point6Long),convertRadians(point7Lat),convertRadians(point7Long))));
        double d7=calcD(calcC(calcA(convertRadians(point7Lat),convertRadians(point7Long),convertRadians(point8Lat),convertRadians(point8Long))));
        double d8=calcD(calcC(calcA(convertRadians(point8Lat),convertRadians(point8Long),convertRadians(point9Lat),convertRadians(point9Long))));
        double d9=calcD(calcC(calcA(convertRadians(point9Lat),convertRadians(point9Long),convertRadians(point10Lat),convertRadians(point10Long))));
        double d10=calcD(calcC(calcA(convertRadians(point10Lat),convertRadians(point10Long),convertRadians(point11Lat),convertRadians(point11Long))));
        double d11=calcD(calcC(calcA(convertRadians(point11Lat),convertRadians(point11Long),convertRadians(point12Lat),convertRadians(point12Long))));
        double d12=calcD(calcC(calcA(convertRadians(point12Lat),convertRadians(point12Long),convertRadians(point13Lat),convertRadians(point13Long))));

        System.out.printf("%.2f",d1+d2+d3+d4+d5+d6+d7+d8+d9+d10+d11+d12);
    }

    public static double convertRadians(double L){
        double radians=(L*Math.PI)/180;
        return radians;
    }

    public static double calcA(double w, double x, double y, double z) {
        double A = Math.sin((w - y) / 2) * Math.sin((w - y) / 2) + Math.cos(w) * Math.cos(y) * Math.sin((x - z) / 2) * Math.sin((x - z) / 2);
        return A;
    }
    public static double calcC(double a){
        double C=2*Math.atan2(sqrt(a),sqrt(1-a));
        return C;
    }
    public static double calcD(double c){
        double D=6371*c;
        return D;
    }
}
