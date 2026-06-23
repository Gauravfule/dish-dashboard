function DishCard({ dish, toggle }) {
  return (
    <div className="card">
      <img
        src={dish.imageUrl}
        alt={dish.dishName}
      />

      <h2>{dish.dishName}</h2>

      <p>
        Status :
        {dish.published
          ? " Published"
          : " Unpublished"}
      </p>

      <button
        onClick={() => toggle(dish.dishId)}
      >
        Toggle Status
      </button>
    </div>
  );
}

export default DishCard;