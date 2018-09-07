(ns exercise7)
	(defn enesimo 
		[x y]
		(into {} [(first (drop x y))])
	)
)