# CDIO2
Create iteration 4
Sander: Vi er blevet enige om en ændring af vores design, da vi ikke kunne får det til at fungere. Vi har fjernet fields fra account klassen og added dem til player klassen og fjernet variablen PlayerID. I account klassen beholder vi kun balance for at have low coupling og i player klassen bruger vi name og account 
til at oprette en konstrukor Player.

I klassen player har vi oprettet en throwDice metode, som laver et tal mellem 2 og 12, så vi kan bruge det i den næste klasse. Vi har også lavet en metode, som kan opdatere balancen i account klassen. Vi har rykket getname til player. Vi har lavet en getMoneymetode i player.

Mangler outputs osv.
