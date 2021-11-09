import Header from "../components/header";

function index() {
  const main_style = {
    margin: "0",
    padding: "0",
    boxSizing: "border - box",
  };
  return (
    <div style={main_style}>
      <Header />
    </div>
  );
}

export default index;
