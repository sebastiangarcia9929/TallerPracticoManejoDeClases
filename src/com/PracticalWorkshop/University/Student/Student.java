package com.PracticalWorkshop.University.Student;

public class Student {

    /**
     * Representa el nombre del estudiante
     */
    String nameStudent;
    /**
     * Representa los apellidos del estudiante
     */
    String lastNames;

    /**
     * Representa la carrera que cuersa el estudiante
     */
    private String universityCareer;

    /**
     * Representa el codigo de identificación de la carrera
     */
    protected int codeCareer;

    /**
     * Representa en que modalidad realiza el estudiante la formación
     */
    private String modality;


    /**
     * Crea una instancia de la clase estudiante
     */
    public Student() {
        this.nameStudent = nameStudent;
        this.lastNames = lastNames;
        this.universityCareer = universityCareer;
        this.codeCareer = codeCareer;
        this.modality = modality;
    }

    /**
     * Metodo get que retorna el nombre del estudiante
     * @return
     */
    public String getNameStudent() {
        return nameStudent;
    }

    /**
     * Metodo con mediante el cual le asignamos un valor al nombre del estudiante
     * @param nameStudent
     */
    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    /**
     * Metodo get que retorna los apellidos del estudiante
     * @return
     */
    public String getLastNames() {
        return lastNames;
    }

    /**
     * Metodo con mediante el cual le asignamos un valor a los apellidos del estudiante
     * @param lastNames
     */
    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    /**
     * Metodo get que retorna la carrera universitaria
     * @return
     */
    public String getUniversityCareer() {
        return universityCareer;
    }

    /**
     * Metodo con mediante el cual le asignamos un valor a la carrera universitaria
     * @param universityCareer
     */
    public void setUniversityCareer(String universityCareer) {
        this.universityCareer = universityCareer;
    }

    /**
     * Metodo get que retorna el codigo de la carrera
     * @return
     */

    public int getCodeCareer() {
        return codeCareer;
    }

    /**
     * Metodo con mediante el cual le asignamos un valor a la carrera universitaria
     * @param codeCareer
     */
    public void setCodeCareer(int codeCareer) {
        this.codeCareer = codeCareer;
    }

    /**
     * Metodo get que retorna la modalidad de estudio
     * @return
     */
    public String getModality() {
        return modality;
    }

    /**
     * Metodo con mediante el cual le asignamos un valor a la modalidad de estudio
     * @param modality
     */
    public void setModality(String modality) {
        this.modality = modality;
    }

    /**
     * Metodo mediante el cual imprimimos los resultados almacenados
     * @return
     */

    @Override
    public String toString() {
        return
                "nameStudent='" + nameStudent + '\'' +
                ", lastNames='" + lastNames + '\'' +
                ", universityCareer='" + universityCareer + '\'' +
                ", codeCareer=" + codeCareer +
                ", modality='" + modality;
    }
}
