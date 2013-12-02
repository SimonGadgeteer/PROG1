import java.util.ArrayList;

/**
 * Diese Klasse simmuliert die Einlagerung und den Verkauf von Fahrzeugen.
 * @author Marc Rennhard, Dave Kramer, Simon Schwarz
 * @version 1.1
 */
public class Simulation
{
  Fahrzeugverwaltung fahrzeugverwaltung;
  private Fahrrad fahrrad;
  private Motorrad motorrad;
  private Auto auto;
  ArrayList<Kunde> kunden;
  
  public Simulation()
  {
    fahrzeugverwaltung = new Fahrzeugverwaltung();
    kunden = new ArrayList<Kunde>();
  }
  
  private void simulieren()
  {
    erzeugeKunden();
    erzeugeFahrzeuge();
    
    System.out.println("Lagerbestand zu Beginn:\n");
    fahrzeugeAusgeben();
    
    System.out.println("Kaufe Fahrzeuge:\n");
    
    kaufeFahrzeuge();
    
    System.out.println("\nLagerbestand am Ende:\n");
    fahrzeugeAusgeben();
  }
  
  private void erzeugeKunden()
  {
    kunden.add(new Kunde("Max Meier"));
    kunden.add(new Kunde("Hans Hepp"));
    kunden.add(new Kunde("Cool Man"));
    kunden.add(new Kunde("Pia Propper"));
    kunden.add(new Kunde("Johny Hatkohle"));
  }
  
  private void erzeugeFahrzeuge()
  {
    erzeugeFahrraeder();
    erzeugeMotorraeder();
    erzeugeAutos();
  }
  
  private void erzeugeFahrraeder()
  {
    fahrzeugverwaltung.erzeugeFahrrad("Scott MTB", 1900, 6, 27);
    fahrzeugverwaltung.erzeugeFahrrad("BMC Carbon", 3995, 2, 27);
    fahrzeugverwaltung.erzeugeFahrrad("Pukky Kids", 330, 3, 1);
  }
  
  private void erzeugeMotorraeder()
  {
    fahrzeugverwaltung.erzeugeMotorrad("KTM 750", 9900, 5, 115, false);
    fahrzeugverwaltung.erzeugeMotorrad("Yamaha VMax", 25000, 3, 150, true);
    fahrzeugverwaltung.erzeugeMotorrad("Harley Fat Boy", 20000, 6, 85, false);
  }
  
  private void erzeugeAutos()
  {
    fahrzeugverwaltung.erzeugeAuto("Skoda Octavia", 39800, 3, 150, 5, true);
    fahrzeugverwaltung.erzeugeAuto("Ferrari Enzo", 565000, 1, 580, 2, false);
    fahrzeugverwaltung.erzeugeAuto("Seat Bigfamily", 42000, 4, 145, 8, false);
  }
  
  private void kaufeFahrzeuge()
  {
    kaufeFahrraeder();
    kaufeMotorraeder();
    kaufeAutos();
  }
  
  private void kaufeFahrraeder()
  {
    //fahrzeugverwaltung.kaufeFahrzeug("Gibt es nicht", 2, kunden.get(0));
    fahrzeugverwaltung.kaufeFahrzeug("Scott MTB", 2, kunden.get(0));
    fahrzeugverwaltung.kaufeFahrzeug("Pukky Kids", 2, kunden.get(1));
    fahrzeugverwaltung.kaufeFahrzeug("Pukky Kids", 2, kunden.get(2));
    fahrzeugverwaltung.kaufeFahrzeug("BMC Carbon", 2, kunden.get(2));
  }

  private void kaufeMotorraeder()
  {
    fahrzeugverwaltung.kaufeFahrzeug("Harley Fat Boy", 1, kunden.get(0));
    fahrzeugverwaltung.kaufeFahrzeug("KTM 750", 3, kunden.get(1));
    fahrzeugverwaltung.kaufeFahrzeug("Harley Fat Boy", 2, kunden.get(2));
  }

  private void kaufeAutos()
  {
    fahrzeugverwaltung.kaufeFahrzeug("Ferrari Enzo", 1, kunden.get(4));
    fahrzeugverwaltung.kaufeFahrzeug("Seat Bigfamily", 3, kunden.get(3));
    fahrzeugverwaltung.kaufeFahrzeug("Seat Bigfamily", 1, kunden.get(2));
  }

  private void fahrzeugeAusgeben()
  {
    fahrzeugverwaltung.ausgeben();
  }
  
  public static void main(String[] args)
  {
    (new Simulation()).simulieren();
  }

}
