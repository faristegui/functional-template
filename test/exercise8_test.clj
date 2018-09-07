(ns exercise8-test
  (:require [clojure.test :refer :all]
            [exercise8 :refer :all]))

(deftest separador-vector-numerico
  (testing "Separa el vector numerico en la posicion pasada por parametro"
    (is (= (separador 3 [1 2 3 4 5 6]) ['(1 2 3) '(4 5 6)]))
  )
)

(deftest separador-vector-mapas
  (testing "Separa el vector de mapas en la posicion pasada por parametro"
    (is (= (separador 1 [:a :b :c :d]) ['(:a) '(:b :c :d)]))
   )
)

(deftest separador-vector-de-vectores
  (testing "Separa el vector de vectores en la posicion pasada por parametro"
    (is (= (separador 2 [[1 2] [3 4] [5 6]]) ['([1 2] [3 4]) '([5 6])])
  )
)