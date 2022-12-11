package com.example.tiendadeportivaversion2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.tiendadeportivaversion2.Adaptadores.ProductoAdapter;
import com.example.tiendadeportivaversion2.Entidades.Producto;

import java.util.ArrayList;

public class CatalogoActivity extends AppCompatActivity {
    private ListView listViewProducts;
    private ProductoAdapter productoAdapter;
    private ArrayList<Producto> arrayProducts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        arrayProducts = new ArrayList<Producto>();
        // *** Creacion de productos
        Producto producto1 = new Producto(getString(R.string.titulo_balon_2022), getString(R.string.descripcion_balon_2022), 1000, R.drawable.balon);
        Producto producto2 = new Producto(getString(R.string.titulo_balon_2018), getString(R.string.descripcion_balon_2018), 2000, R.drawable.balon2018);
        Producto producto3 = new Producto(getString(R.string.titulo_balon_2014), getString(R.string.descripcion_balon_2014), 3000, R.drawable.balon2014);
        Producto producto4 = new Producto(getString(R.string.titulo_balon_2010), getString(R.string.descripcion_balon_2010), 4000, R.drawable.balon2010);
        Producto producto5 = new Producto(getString(R.string.titulo_balon_2006), getString(R.string.descripcion_balon_2006), 5000, R.drawable.balon2006);
        Producto producto6 = new Producto(getString(R.string.titulo_zapatos_1), getString(R.string.descripcion_zapatos_1), 6000, R.drawable.zapatos1);
        Producto producto7 = new Producto(getString(R.string.titulo_zapatos_2), getString(R.string.descripcion_zapatos_2), 7000, R.drawable.zapatos2);
        Producto producto8 = new Producto(getString(R.string.titulo_zapatos_3), getString(R.string.descripcion_zapatos_3), 8000, R.drawable.zapatos3);
        Producto producto9 = new Producto(getString(R.string.titulo_pantaloneta), getString(R.string.descripcion_pantaloneta), 9000, R.drawable.pantalonetas1);

        arrayProducts.add(producto1);
        arrayProducts.add(producto2);
        arrayProducts.add(producto3);
        arrayProducts.add(producto4);
        arrayProducts.add(producto5);
        arrayProducts.add(producto6);
        arrayProducts.add(producto7);
        arrayProducts.add(producto8);
        arrayProducts.add(producto9);

        // ***
        productoAdapter = new ProductoAdapter(this, arrayProducts);
        listViewProducts = (ListView) findViewById(R.id.listViewProducts);

        listViewProducts.setAdapter(productoAdapter);

    }
}