package com.zipcodewilmington.froilansfarm.animals.person;

import com.zipcodewilmington.froilansfarm.Rideable;

public interface Rider  {

     <SomeRide extends Rideable> void mount(SomeRide ride);

     <SomeRide extends Rideable> void dismount(SomeRide ride);

}
