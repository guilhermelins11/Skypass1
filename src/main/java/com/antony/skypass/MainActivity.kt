package com.antony.skypass

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editNome = findViewById<EditText>(R.id.editNome)
        val editSenha = findViewById<EditText>(R.id.editSenha)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvCadastro = findViewById<TextView>(R.id.tvCadastro) // Adicionando TextView

        btnLogin.setOnClickListener {
            val userText = editNome.text.toString()
            val passText = editSenha.text.toString()

            if (userText == "admin" && passText == "1234") {
                Toast.makeText(this, "Login realizado com sucesso!", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Usuário ou senha incorretos", Toast.LENGTH_SHORT).show()
            }
        }

        // Tornando o TextView clicável para abrir CadastroActivity
        tvCadastro.setOnClickListener {
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }
    }
}
