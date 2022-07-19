# Tennis-Ball-Shooter
Tennis ball shooter bot for the heritage day parrade of 2021

### Features
 - `Auto drive`
    - Automaticly moves the bot forward
 - `Drive trimming`
    - Fine control over the auto drive locked state
 - ~~`Shooting`~~
    - ~~Fires tennis balls from a front mounted cannon~~ (ran out of time)
 - `Beyblade Mode`
    - "Beyblade beyblade let it rip".

---

# OI Map
This contains the mappings of each motor. It also contains controller mappings so drivers know how to use the bot.

### PWM Slots
 - `0` - Left drive motor
 - `1` - Right drive motor
 - ~~`2` - Fire motor top~~
 - ~~`3` - Fire motor bottom~~

### PCM Slots
 - ~~`1` - Forward piston~~
 - ~~`2` - Backward piston~~

### Controller
 - `Left joystick` - Left motor control
 - `Right joystick` - Right motor control

 - ~~`RT` - Shoots the tennis ball~~
 - `LT` - Activates/Deactivates motor lock

 - `X` - Allows fine control over the left motor lock
 - `B` - Allows fine control over the right motor lock

 - `LB` - Increase fine control (depending on Y or X buttons)
 - `RB` - Decrease fine control (depending on Y or X buttons)

 - `A` - While held activate Beyblade mode