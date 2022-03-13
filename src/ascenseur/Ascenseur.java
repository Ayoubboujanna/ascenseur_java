package ascenseur;

import java.util.ArrayList;

import javax.swing.JPanel;

public class Ascenseur extends Thread {
	private int x, y; // Position de l'ascenseur
	private JPanel as; // Panel de l'ascenseur
	private Personne person; 
	private ArrayList<Personne> personnesIn = new ArrayList<Personne>();
	
	
	public Ascenseur(JPanel as, Personne person)
	{
		this.as = as;
		this.x = as.getLocation().x;
		this.y = as.getLocation().y;
		this.person = person;
		
	}
	
	synchronized void goUp()
	{
		this.as.setLocation(this.as.getLocation().x, this.as.getLocation().y - 60);
	}
	
	synchronized void goDown()
	{
		this.as.setLocation(this.as.getLocation().x, this.as.getLocation().y + 60);
	}
	
	@Override
	public void run() {
		
		if(person.getAppel() == true)
		{
			System.out.println("J'entre dans la condition 1, appel vraie!");
			
			if(person.getEtage() < this.getY())
			{
				System.out.println("J'entre dans la condition 2, etage de l'ascenseur inf à etage de la personne!");
				int nf = person.goToInv(person.getEtage()) - this.goToInv(this.getY());
				System.out.println("YAsc : " + this.getY() + " EtAsc : " + this.goToInv(this.getY()) + "\nYPer : " + person.getEtage() + " EtPers : " + person.goToInv(person.getEtage()) + "\n\tNbre d'iteration : " + nf);
				
				for(int i = 0; i < nf; i++)
				{
					this.goUp();
					this.setY(this.as.getLocation().y);
					try 
					{
						sleep(500);
					} 
					catch (Exception e) 
					{
						e.printStackTrace();
					}
				}
				if(personnesIn.size() < 4)
				{
					System.out.println("J'entre dans la condition 3, size < 4");
					
					this.personnesIn.add(person);
					person.goIn(this.as);
					try 
					{
						Personne.sleep(500);
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
					if(person.getEtageTo() < this.getY())
					{
						int nt = this.goToInv(person.getEtageTo()) - this.goToInv(this.getY());
						System.out.println("YAsc : " + this.getY() + " EtAsc : " + this.goToInv(this.getY()) + "\nYPer : " + person.getEtageTo() + " EtPers : " + person.goToInv(person.getEtageTo()) + "\n\tNbre d'iteration : " + nt);
						
						for(int i = 0; i < nt; i++)
						{
							this.goUp();
							try
							{
								sleep(500);
							}
							catch (InterruptedException e) 
							{
								e.printStackTrace();
							}
						}
						person.goOut(this.as);
						this.personnesIn.remove(person);
					}
					else if(person.getEtageTo() > this.getY())
					{
						int nt = this.goToInv(this.getY()) - this.goToInv(person.getEtageTo());
						System.out.println("YAsc : " + this.getY() + " EtAsc : " + this.goToInv(this.getY()) + "\nYPer : " + person.getEtageTo() + " EtPers : " + person.goToInv(person.getEtageTo()) + "\n\tNbre d'iteration : " + nt);
						
						for(int i = 0; i < nt; i++)
						{
							this.goDown();
							try
							{
								sleep(500); 
							}
							catch (InterruptedException e) 
							{
								e.printStackTrace();
							}
						}
						person.goOut(this.as);
						this.personnesIn.remove(person);
					}
				}
				else
				{
					try 
					{
						person.wait();
						
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					};
				}
			}
			if(person.getEtage() > this.getY())
			{
				System.out.println("J'entre dans la condition 2, etage de l'ascenseur sup à etage de la personne!");
				int nf = this.goToInv(this.getY()) - person.goToInv(person.getEtage());
				System.out.println("YAsc : " + this.getY() + " EtAsc : " + this.goToInv(this.getY()) + "\nYPer : " + person.getEtage() + " EtPers : " + person.goToInv(person.getEtage()) + "\n\tNbre d'iteration : " + nf);
				
				for(int i = 0; i < nf; i++)
				{
					this.goDown();
					this.setY(this.as.getLocation().y);
					try 
					{
						sleep(500);
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
				}
				if(personnesIn.size() < 4)
				{
					this.personnesIn.add(person);
					person.goIn(this.as);
					try 
					{
						Personne.sleep(500);
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
					if(person.getEtageTo() < this.getY())
					{
						int nt = this.goToInv(person.getEtageTo()) - this.goToInv(this.getY());
						System.out.println("YAsc : " + this.getY() + " EtAsc : " + this.goToInv(this.getY()) + "\nYPer : " + person.getEtageTo() + " EtPers : " + person.goToInv(person.getEtageTo()) + "\n\tNbre d'iteration : " + nt);
						
						for(int i = 0; i < nt; i++)
						{
							this.goUp();
							try
							{
								sleep(500);
							}
							catch (InterruptedException e) 
							{
								e.printStackTrace();
							}
						}
						person.goOut(this.as);
						this.personnesIn.remove(person);
					}
					if(person.getEtageTo() > this.getY())
					{
						int nt = this.goToInv(this.getY()) - this.goToInv(person.getEtageTo());
						System.out.println("YAsc : " + this.getY() + " EtAsc : " + this.goToInv(this.getY()) + "\nYPer : " + person.getEtageTo() + " EtPers : " + person.goToInv(person.getEtageTo()) + "\n\tNbre d'iteration : " + nt);
						
						for(int i = 0; i < nt; i++)
						{
							this.goDown();
							try
							{
								sleep(500); 
							}
							catch (InterruptedException e) 
							{
								e.printStackTrace();
							}
						}
						person.goOut(this.as);
						this.personnesIn.remove(person);
					}
				} 
				else
				{
					try 
					{
						person.wait();
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
				}
			}
			
		}

	}

	public int goToInv(int yEtage)
	{
		int etage = 0;
		switch(yEtage)
		{
			case 310 :
				etage = 0;
				break;
			case 250 :
				etage = 1;
				break;
			case 190 :
				etage = 2;
				break;
			case 130 :
				etage = 3;
				break;
			case 70 :
				etage = 4;
				break;
			case 10 :
				etage = 5;
				break;
			}
			return etage;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public synchronized int getY()
	{
		return this.y;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}

}
