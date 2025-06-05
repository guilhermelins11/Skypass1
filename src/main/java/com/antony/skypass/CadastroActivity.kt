package com.antony.skypass

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val editNome = findViewById<EditText>(R.id.editNome)
        val editEmail = findViewById<EditText>(R.id.editEmail)
        val editSenha = findViewById<EditText>(R.id.editSenha)
        val editConfirmSenha = findViewById<EditText>(R.id.editConfirmSenha)
        val btnCadastro = findViewById<Button>(R.id.btnCadastro)

        btnCadastro.setOnClickListener {
            val userText = editNome.text.toString().trim()
            val userEmail = editEmail.text.toString().trim()
            val passText = editSenha.text.toString().trim()
            val passConfirmText = editConfirmSenha.text.toString().trim()

            if (userText.isEmpty() || userEmail.isEmpty() || passText.isEmpty() || passConfirmText.isEmpty()){
             Toast.makeText(this, "Por Favor, preencha todos os campos!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (!android.util.Patterns.EMAIL_ADDRESS.matcher(userEmail).matches()) {
                Toast.makeText(this, "Email inválido!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (passText != passConfirmText) {
                Toast.makeText(this, "As senhas não coincidem!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(this, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}