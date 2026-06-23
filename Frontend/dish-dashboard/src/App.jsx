import { useEffect, useState } from "react";
import axios from "./api";
import DishCard from "./components/DishCard";
import "./App.css";

function App() {

  const [dishes,setDishes] = useState([]);

  const loadDishes = async () => {

    const response =
      await axios.get("/dishes");

    setDishes(response.data);
  };

  useEffect(() => {
    loadDishes();
  }, []);

  const toggleStatus = async(id) => {

    await axios.put(
      `/dishes/${id}/toggle`
    );

    loadDishes();
  };

  return (
  <div className="container">
    <h1 className="title">Dish Dashboard</h1>

    <div className="dish-grid">
      {dishes.map((dish) => (
        <DishCard
          key={dish.dishId}
          dish={dish}
          toggle={toggleStatus}
        />
      ))}
    </div>
  </div>
);
}

export default App;