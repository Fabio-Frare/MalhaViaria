
package br.udesc.dsd.model.carro;

import br.udesc.dsd.model.casa.ICasa;

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
