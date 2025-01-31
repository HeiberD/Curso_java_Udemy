package Ejercicios_Udemy;
public class TrapecioArea {

    public static void main(String[] args) {
        // Datos de radiación proporcionados
        double[] radiacion = {
            160.94, 171.23, 179.02, 179.9, 161.52, 148.73, 168.58, 180.2, 179.61, 184.02, 196.52,
            210.34, 206.96, 203.13, 204.31, 212.69, 225.19, 229.01, 230.63, 231.8, 231.65, 244.89,
            254.15, 261.06, 277.23, 290.61, 303.7, 321.34, 336.04, 348.54, 366.48, 387.21, 399.41,
            432.78, 459.39, 459.39, 495.12, 500.56, 560.4, 633.18, 656.26, 736.97, 734.48, 754.32,
            712.42, 547.61, 494.68, 497.62, 568.34, 492.62, 441.75, 474.69, 424.99, 397.35, 422.49,
            444.99, 450.28, 426.46, 426.02, 774.47, 840.19, 932.37, 689.78, 941.04, 1056.75, 1018.82,
            1006.32, 460.72, 483.21, 450.72, 595.69, 750.94, 517.17, 472.48, 452.93, 404.11, 381.18,
            388.09, 389.26, 391.18, 419.55, 992.21, 460.72, 431.61, 410.44, 395.59, 375.15, 381.91,
            402.64, 605.24, 1073.07, 397.64, 593.48, 493.5, 505.27, 433.67, 389.26, 369.71, 351.48,
            332.37, 395.15, 452.19, 459.54, 468.95, 351.33, 351.33, 418.08, 436.02, 514.82, 771.23,
            468.07, 564.66, 459.69, 446.31, 397.5, 353.54, 369.12, 404.7, 403.23, 352.8
        };

        // Intervalo de tiempo en minutos (asumimos 1 minuto entre cada medición)
        double deltaTiempo = 1.0;

        // Calcular el área bajo la curva usando el método de los trapecios
        double areaTotal = calcularAreaTrapecios(radiacion, deltaTiempo);

        // Mostrar el área total
        System.out.printf("Área bajo la curva: %.2f\n", areaTotal);
    }

    // Método para calcular el área bajo la curva usando el método de los trapecios
    public static double calcularAreaTrapecios(double[] valores, double deltaTiempo) {
        double area = 0.0;
        
        for (int i = 0; i < valores.length - 1; i++) {
            // Área de cada trapecio
            double areaTrapecio = (valores[i] + valores[i + 1]) / 2.0 * deltaTiempo;
            area += areaTrapecio;
        }
        
        return area;
    }
}
