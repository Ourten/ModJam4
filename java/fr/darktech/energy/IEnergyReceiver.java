package fr.darktech.energy;

public interface IEnergyReceiver {

    
    int demandsEnergy();
    int injectEnergy(int amount);
    int getEnergyNeeded();
    int getEnergyRemaning();
}
