package com.PracticalWorkshop.University.Modality;

public class StudyModality {


    /**
     * Representa el tipo de estudio presencial
     */
    private Boolean faceToFace;

    /**
     * Representa el tipo de estudio virtual
     */
    private Boolean virtual;

    /**
     * Representa el tipo de estudio a distancia
     */
    private Boolean fromDistance;


    /**
     *  Crea una instancia de la clase modalidad de estudio
     */
    public StudyModality() {
    }

    /**
     * Metodo get que retorna  el tipo de modalidad de estudio presencial
     * @return
     */

    public Boolean getFaceToFace() {
        return faceToFace;
    }

    /**
     * Metodo con mediante el cual le asignamos un valor logico
     * @param faceToFace
     */

    public void setFaceToFace(Boolean faceToFace) {
        this.faceToFace = faceToFace;
    }

    /**
     * Metodo get que retorna  el tipo de modalidad de estudio virtual
     * @return
     */

    public Boolean getVirtual() {
        return virtual;
    }

    /**
     * Metodo con mediante el cual le asignamos un valor logico
     * @param virtual
     */

    public void setVirtual(Boolean virtual) {
        this.virtual = virtual;
    }

    /**
     * Metodo get que retorna  el tipo de modalidad de estudio a distancia
     * @return
     */

    public Boolean getFromDistance() {
        return fromDistance;
    }

    /**
     * Metodo con mediante el cual le asignamos un valor logico
     * @param fromDistance
     */

    public void setFromDistance(Boolean fromDistance) {
        this.fromDistance = fromDistance;
    }
}
