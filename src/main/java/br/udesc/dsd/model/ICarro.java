
package br.udesc.dsd.model;

/**
 *
 * @author fabio
 */
public interface ICarro {

    public void desativar();

    public void enterSimulation(ICasa casaAleatoria);

    @Override
    public boolean equals(Object obj);

    public int getRBG();

    public void obterRota();

    public void mover();

    public void setCasa(ICasa newCasa);

    public ICasa getCasa();

    public long getId();

    public void join() throws InterruptedException;

    public void sleep(int nextInt);

    public int getVelocidade();

}
