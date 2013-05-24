package blog.engine.onlinePF.inverseBucket;

import java.util.Set;

import blog.engine.Particle;
import blog.engine.onlinePF.ObservabilitySignature;
import blog.sample.Sampler;
import blog.world.DefaultPartialWorld;

public class TimedParticle extends Particle{
	public TimedParticle(Set idTypes, int numTimeSlicesInMemory, Sampler sampler) {
		super(idTypes, numTimeSlicesInMemory, sampler);
		// TODO Auto-generated constructor stub
	}
	protected int timeStep = -1;
	public int getTimestep(){
		return timeStep;
	}
	public void advanceTimestep(){
		timeStep ++;
	}
	private Integer myOSIndex;
	public Integer getOS (){
		return myOSIndex;
	}
	public void setOS (Integer osIndex){
		myOSIndex = osIndex;
	}
	
	public TimedParticle copy(){
		TimedParticle copy = new TimedParticle(idTypes, numTimeSlicesInMemory, sampler);
		copy.timeStep=this.timeStep;
		DefaultPartialWorld newWorld = (DefaultPartialWorld) ((DefaultPartialWorld) curWorld)
				.clone();
		copy.setWorld(newWorld);
		copy.weight = 1;
		copy.setOS(myOSIndex);
		return copy;
	}
}
