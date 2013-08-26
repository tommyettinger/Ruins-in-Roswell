Ruins in Roswell
================

A text-based dungeon exploration roguelike/RPG written in Clojure.

How To Run
==========

In short: lein run.  For the full explanation...

1.  (Optional) Run `lein deps` to grab dependencies (You do have Leiningen installed, right?  If not,
[Lein awaits you](http://leiningen.org/) ).  SquidLib should be on Maven Central now, so leiningen can fetch it automatically, and 
the initial version of this project's bundled SquidLib is no longer needed.
2.  Run `lein run` and wait a bit.  If you didn't run `lein deps` , it will fetch dependencies now, and then eventually
start.  Even if you did, loading all of Swing, the Seesaw binding to Swing in Clojure, Seesaw's several dependencies,
SquidLib for faking a console and roguelike utilities such as Field of View, and HipHip for array
handling will take some time.  Now this *is* AOT-compiled (I forked hiphip to make hiphip-aot),
so the first compilation step will take longer but the game will start up much faster.  An older version needed LibGDX (a large dependency of
SquidLib) and LWJGL (another dependency of LibGDX) as dependencies, but I forked SquidLib to not need these.

How To Play
===========

1.  Use the arrow keys to move around.  '#'s are walls, '.'s are floor tiles, and you are the '@'.  Other furnishings
exist, such as '~', '+', '%', and '$', but they act the same as floors for now.
Red 'M's are Monsters, they can damage you if they bump into you.
Bump into monsters to attack them.  You start with 80 HP, monsters have 8, and the damage dealt by a bump is a
random number between 1 and 6, inclusive, for both you and monsters.  You can also glare at a monster by hitting the key
that matches the letter or number it is listed with on the left bar, like <1> has you hit '1' to glare at the monster
for 1 or 2 points of damage.  There is no range limit on a glare, but you need to be able to see the monster.
2. Find a staircase.  '<' goes up (think of the rewind symbol), '>' goes down (think of the fast forward symbol).
Entering a staircase takes you to a deeper level or out of the dungeon (only if you go up on floor 1) and
resets the position of monsters, but does not add more monsters right now.  What you've seen on previous floors is
remembered when you return to them.
3.  Hope I actually add the Roswell part to the Ruins part that's already here.

Features
========

+ Herringbone Wang tile dungeon generation.  As far as I know there are no roguelikes using this beautifully simple,
high-quality dungeon generator algorithm, which I reimplemented
from <http://nothings.org/gamedev/herringbone/> .
+ Dijkstra maps for basic pathfinding, and AI for fleeing and the like.
Credit here belongs to [Joshua Day](https://github.com/joshuaday) for coming up with the dijkstra map
technique, and kaw from #clojure on freenode, who improved my non-working code.
+ A GUI for this text-based game, using the amazing [SquidLib](https://github.com/SquidPony/SquidLib) by Eben Howard.

Thanks for visiting!
