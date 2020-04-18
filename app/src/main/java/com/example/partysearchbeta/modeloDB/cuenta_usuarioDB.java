package com.example.partysearchbeta.modeloDB;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import com.example.partysearchbeta.modelo.cuenta_usuario;

public class cuenta_usuarioDB extends cuenta_usuario {

    private static final String DATABASE="partysearch.db";
    private SuperHelper superHelper;

    public cuenta_usuarioDB(int persona_codigo, String persona_nombre, String persona_apellido, String persona_corre_electronico, String persona_telefono, int usu_codigo, String usu_nombre, String usu_contrasena) {
        super(persona_codigo, persona_nombre, persona_apellido, persona_corre_electronico, persona_telefono, usu_codigo, usu_nombre, usu_contrasena);
    }

    public String crearUsuario(){
        String SQLi="";
        SQLi+="insert into persona (persona_nombre,persona_apellido, persona_correo_electronico, persona_telefono)";
        SQLi+=" values (";
        SQLi+="'"+getPersona_nombre()+"'";
        SQLi+=",'"+getPersona_apellido()+"'";
        SQLi+=",'"+getPersona_corre_electronico()+"'";
        SQLi+=",'"+getPersona_telefono()+"'";
        SQLi+=")";
        try {
            superHelper.getWritableDatabase().execSQL(SQLi);
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
            return ex.getMessage();
        }
        return null;


    }

    public String eliminaUsuario(String RUC){
        String SQLi="";
        SQLi+="delete from cuenta_usuario ";
        SQLi+=" where usu_codigo='"+getUsu_codigo()+"'";
        try {
            superHelper.getWritableDatabase().execSQL(SQLi);
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
            return ex.getMessage();
        }
        return null;
    }

    // recuperar los usuarios.
    public Cursor listaUsuarios(){
        Cursor cursor;
        String SQLC="select ROWID as _id,* from cuenta_usuario";
        cursor= superHelper.getReadableDatabase().rawQuery(SQLC,null);
        return cursor;
    }

}
