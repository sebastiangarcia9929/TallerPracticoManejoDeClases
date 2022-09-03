package com.PracticalWorkshop.University.Career;

import java.util.ArrayList;
import java.util.List;

public class Career {

    /**
     * Representa el nombre de la carrera
     */
     private String career;

    /**
     * Represente el dodigo de la carrera
     */
    private int codeCareeer;

    /**
     * Lista en la que se almacenaran las carreras
     */
     List<Career> careers = new ArrayList<>();

    /**
     * Crea una instancia de la clase carrera
     */
    public Career() {
    }

    /**
     * Metodo get que retorna el nombre de la carrera
     * @return
     */
    public String getCareer() {
        return career;
    }

    /**
     * Metodo con mediante el cual le asignamos un valor a la variable carrera
     * @param career
     */
    public void setCareer(String career) {
        this.career = career;
    }


    /**
     * Metodo get que retorna el codigo de la carrera
     * @return
     */
    public int getCodeCareeer() {
        return codeCareeer;
    }

    /**
     * Metodo con mediante el cual le asignamos un valor al codigo de la carrera
     * @param codeCareeer
     */

    public void setCodeCareeer(int codeCareeer) {
        this.codeCareeer = codeCareeer;
    }


    /**
     * Metodo con el cual registraremos las materias en una lista
     * @param career
     * @return
     */

    public List<Career> CareerList(Career career){
        careers.add(career);
        return careers;
    }

    /**
     * Metodo mediante el cual imprimimos los resultados almacenados
     * @return
     */

    @Override
    public String toString() {
        return
                "career='" + career + '\'' +
                ", codeCareeer=" + codeCareeer;
    }
}
