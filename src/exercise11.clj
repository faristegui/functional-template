(ns exercise11)
(defn fmap-nil
  [x y]
  ( let [value  (get x y ) ]
    (nil? value)
    )
  )