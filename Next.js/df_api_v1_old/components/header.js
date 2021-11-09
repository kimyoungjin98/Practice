function header() {
  const title = {
    color: "white",
    textShadow: "1px 1px 1px black",
    textAlign: "center",
  };

  const header = {
    display: "flex",
    backgroundColor: "black",
    height: "10vh",
  };

  return (
    <header style={header}>
      <h2 style={title}>D&F Infomation Service</h2>
    </header>
  );
}

export default header;
