(defproject rir "0.0.1"
  :description "Text-based Dungeon Exploration Roguelike/RPG"
  :url "https://github.com/tommyettinger/Ruins-in-Roswell"
  :license {:name "MIT License"
            :url "http://mit-license.org/"}
  ; :plugins [[org.timmc/lein-otf "2.0.1"]]
  :dependencies [
                 [org.clojure/clojure "1.5.1"]
                 [hiphip-aot "0.1.1"] ;[prismatic/hiphip "0.1.0"]
                 [seesaw "1.4.1"]
                 [com.squidpony/squidlib "1.95.1"]]
  ;:resource-paths ["lib/"]
  :jvm-opts ^:replace []
  :aot [rir.herringbone rir.weapons rir.combat rir.core]
  :main rir.core
 )
; ^:skip-aot
