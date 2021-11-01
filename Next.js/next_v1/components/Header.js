import Link from "next/link";

const Header = () => {
  const style = {
    margin: "5px",
  };

  return (
    <div className="div_header">
      <Link href="/">
        <a style={style}>Home</a>
      </Link>
      <Link href="/hello">
        <a style={style}>DOC</a>
      </Link>
      <Link href="/Login">
        <a style={style}>로그인</a>
      </Link>
    </div>
  );
};

export default Header;
