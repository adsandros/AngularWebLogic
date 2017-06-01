/*
 * @(#) ${artifactId}
 *
 * Copyright (c) 2016 Farmatodo, C.A.
 * Caracas, Venezuela
 * All Rights Reserved.
 * http://www.farmatodo.com/
 *
 * This software is the confidential and proprietary information of
 * Farmatodo, C.A.
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with
 * Farmatodo, C.A.
 */

//package ${package}.constantes;
package ve.com.farmatodo.item.constantes;

/**
 * Constantes usadas por la aplicaci&oacute;n.
 *
 * @author <a href="mailto:@">Autor</a> 
 * @version 1.0
 */
public final class Constantes {
    /**
     * Nombre de la aplicaci&oacute;n.
     */
    public static final String NOMBRE_APLICACION = "ATENCION FARMACEUTICA";

    /**
     * C&oacute;digo de la aplicaci&oacute;n.
     */
    public static final String CODIGO_APLICACION = NOMBRE_APLICACION.substring(0,2).toUpperCase();

    /**
     * Descripci&oacute;n de la aplicaci&oacute;n.
     */
    public static final String DESCRIPCION_APLICACION = "comendados";

    /**
     * Plataforma.
     */
    public static final String PLATAFORMA = "weblogic11g 12.2.0 java 1.8";

    /**
     * C&oacute;digo de &eacute;xito devuelto por un procedimiento o funci&oacute;n de BD.
     */
    public static final String BD_CODIGO_EXITO = "FTD-0000";

    /**
     * C&oacute;digo de ERROR PARAMETROS DE ENTRADA.
     */
    public static final String CODIGO_ERROR_PARAM_ENTRADA = "FTD-0098";

    /**
     * Gui&oacute;n usado para unir palabras.
     */
    public static final String GUION = " - ";

    /**
     * Nombre de la plataforma de BD usada para este ejemplo.
     */
    public static final String DEST_BD_SAMPLE = "BDUC";

    /**
     * Nombre del datasource usado para la BD de ejemplo.
     */
    public static final String DATASOURCE_BD_SAMPLE = "jdbc/FTD_ITEMS";

    /**
     * Mensaje cuando el pais es null.
     */
    public static final String MENSAJE_PAIS = "El pais no puede ser vacio o null";


    /**
     * Mensaje cuando el NUMERO MAXIMO es null.
     */
    public static final String MENSAJE_NUMMAX = "El numero maxino de items tiene que ser mayor a cero(0)";

    /**
     * Mensaje cuando el APLICACION es null.
     */
    public static final String MENSAJE_APP_ID = "El nombre de la aplicacion.id es vacio o null";

    /**
     * Mensaje cuando el SIZE es null.
     */
    public static final String MENSAJE_SIZE_ID = "La aplicacion.tipo tiene que ser: BIG, MEDIUM o SMALL";

    /**
     * Constructor de la clase.
     */
    private Constantes() {
    }
}