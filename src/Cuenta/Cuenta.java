package Cuenta;

import Cliente.Cliente;

public class Cuenta {

    private int numero;
    private float monto;
    private float saldo;

    public Cuenta() {
    }

    public Cuenta(int numero, float monto, float saldo) {
        this.numero = numero;
        this.monto = monto;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", monto=" + monto + ", saldo=" + saldo + '}';
    }

}
