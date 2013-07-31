(ns rir.combat
  (:use rir.weapons))

(def stats {
:armor {:stat "Armor", :description "Your equipment's durability; your clothing's ability to hide your movement; how attentive you are to what you wear.", :effect "Flaw Defense", :effect-meaning "Having your weaknesses exposed less often."}
:brawn {:stat "Brawn", :description "Your physical strength; how much you can carry; your familiarity with how to damage objects or people.", :effect "Damage Offense", :effect-meaning "Dealing more damage."}
:caution {:stat "Caution", :description "Your wisdom; your judgment of how people's actions will play out; how careful you are in dangerous situations.", :effect "Boost Defense", :effect-meaning "Raising one ally's defense."}
:deception {:stat "Deception", :description "Your cunning; how well you can confuse or lie to people; your ability to sneak or hide.", :effect "Trick Offense", :effect-meaning "Tricking enemies to make them lose bonuses."}
:endurance {:stat "Endurance", :description "Your bodily toughness; your general healthiness; how well you pick yourself up after getting hurt.", :effect "Damage Defense", :effect-meaning "Taking less damage."}
:finesse {:stat "Finesse", :description "Your manual dexterity; how sure-footed you are; your physical performance on delicate tasks.", :effect "Accuracy Offense", :effect-meaning "Hitting more often."}
:insight {:stat "Insight", :description "Your social awareness; your ability to understand or analyze the behavior of people; how well you can sense lies.", :effect "Trick Defense", :effect-meaning "Resisting the loss of bonuses from tricks."}
:knowledge {:stat "Knowledge", :description "Your academic intelligence; how well you can figure out puzzles; your skill with machines and devices.", :effect "Boost Offense", :effect-meaning "Raising one ally's offense."}
:persuasion {:stat "Persuasion", :description "Your ability to make friends; your perceived likability; how well you can inspire people to do their best.", :effect "Group Offense", :effect-meaning "Making nearby allies have slightly higher offense."}
:quickness {:stat "Quickness", :description "Your speed and agility; your reaction time; how fast you can run to or from danger.", :effect "Accuracy Defense", :effect-meaning "Being hit less often."}
:senses {:stat "Senses", :description "Your quality of sight and hearing; your ability to notice hidden things; how alert you are.", :effect "Flaw Offense", :effect-meaning "Exposing weaknesses in enemies more often."}
:tenacity {:stat "Tenacity", :description "Your willpower; your refusal to change course against your wishes; how intimidating you can be.", :effect "Group Defense", :effect-meaning "Making nearby allies have slightly higher defense."}
})

; Armor    Endurance   Finesse     Quickness   Senses   Knowledge   Brawn    Finesse     Brawn     Brawn     Finesse     Deception   Finesse     Tenacity    Finesse       Tenacity
; Block    Counter     Disarm      Trip        Aim      Guide       Pin      Bounce      Grab      Push      Pull        Distract    Bonk        Threat      Distant Bonk  Distant Threat
(def maneuvers {
:block {:maneuver "Block" :stat :armor}
:counter {:maneuver "Counter" :stat :endurance}
:disarm {:maneuver "Disarm" :stat :finesse}
:trip {:maneuver "Trip" :stat :quickness}
:aim {:maneuver "Aim" :stat :senses}
:guide {:maneuver "Guide" :stat :knowledge}
:pin {:maneuver "Pin" :stat :brawn}
:bounce {:maneuver "Bounce" :stat :finesse}
:grab {:maneuver "Grab" :stat :brawn}
:push {:maneuver "Push" :stat :brawn}
:pull {:maneuver "Pull" :stat :finesse}
:distract {:maneuver "Distract" :stat :deception}
:bonk {:maneuver "Bonk" :stat :finesse}
:threat {:maneuver "Threat" :stat :tenacity}
:distant-bonk {:maneuver "Distant Bonk" :stat :finesse}
:distant-threat {:maneuver "Distant Threat" :stat :tenacity}
})