import NavBar from "components/NavBar"
import Footer from "components/Footer"
import DataTable from "components/DataTable"
import BarChart from "components/BarChart"
import DonutChart from "components/DonutChart"

const Dashboard = () => {
  return (
    <>

      <NavBar />
      <div className="container">
        <h1 className="text-primary">Dashboard de Vendas</h1>
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de Sucesso %</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Todas vendas</h5>
            <DonutChart />
          </div>
        </div>

        <DataTable />
      </div>
      <Footer />

    </>
  );
}

export default Dashboard;